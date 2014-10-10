package rtn.networking.admin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.sshd.server.Command;
import org.apache.sshd.server.Environment;
import org.apache.sshd.server.ExitCallback;

public class SSHCommand implements Command
{
	private String name;
	
	private InputStream in;
    private OutputStream out;
    private OutputStream err;
    private ExitCallback callback;
    
    public SSHCommand(String command)
    {
    	this.name = command;
    }

    public InputStream getIn()
    {
        return in;
    }

    public OutputStream getOut()
    {
        return out;
    }

    public OutputStream getErr()
    {
        return err;
    }

    public void setInputStream(InputStream in)
    {
        this.in = in;
    }

    public void setOutputStream(OutputStream out)
    {
        this.out = out;
    }

    public void setErrorStream(OutputStream err)
    {
        this.err = err;
    }

    public void setExitCallback(ExitCallback callback)
    {
        this.callback = callback;
    }

    public void start(Environment env) throws IOException
    {
        try
        {
        	if(!this.name.equals("error"))
        	{
        		out.write((this.name).getBytes());
        		out.flush();
        	}
        	else
        	{
        		err.write(("error").getBytes());
        		err.flush();
        	}
        }
        catch (Exception e)
        {
        }
        finally
        {
            callback.onExit(0);
        }
    }

	@Override
	public void destroy() {}
}