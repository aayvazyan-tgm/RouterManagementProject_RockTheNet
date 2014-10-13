package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DataLoad
{
    private static final Logger logger = LoggerFactory.getLogger(DataLoad.class);

	public int upload;

	public int download;

	public int getUpload()
	{
		return upload;
	}

	public void setUpload(int upload)
	{
		this.upload = upload;
	}

	public int getDownload()
	{
		return download;
	}

	public void setDownload(int download)
	{
		this.download = download;
	}
}