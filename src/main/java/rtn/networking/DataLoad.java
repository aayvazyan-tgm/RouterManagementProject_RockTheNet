package rtn.networking;

/**
 * This element consists of separate values for upload and download traffic.
 */
public class DataLoad
{
	public int upload;
	public int download;

	/**
	 * Gets the upload.
	 *
	 * @return the upload
	 */
	public int getUpload()
	{
		return upload;
	}

	/**
	 * Sets the upload.
	 *
	 * @param upload the new upload
	 */
	public void setUpload(int upload)
	{
		this.upload = upload;
	}

	/**
	 * Gets the download.
	 *
	 * @return the download
	 */
	public int getDownload()
	{
		return download;
	}

	/**
	 * Sets the download.
	 *
	 * @param download the new download
	 */
	public void setDownload(int download)
	{
		this.download = download;
	}
}