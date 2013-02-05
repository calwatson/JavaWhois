package org.neverfear.whois;

/**
 * Represents the response from a whois server.
 * @author doug@neverfear.org
 *
 */
public class WhoisResponse {
	private String reply;
	private String query;
	
	/**
	 * Construct a response for the name.
	 * @param name The domain name.
	 * @param data The response contents.
	 */
	public WhoisResponse(String name, String data) {
		query = name;
		reply = data;
	}

	/**
	 * Construct a response for the name. Protected constructor.
	 * @param name The domain name.
	 */
	protected WhoisResponse(String name)
	{
		query = name;
		reply = null;
	}
	
	/**
	 * Get the response contents.
	 * @return response contents.
	 */
	public String getData() {
		return reply;
	}
	
	/**
	 * Set the data. Protected.
	 * @param data
	 */
	protected void setData(String data)
	{
		reply = data;
	}
	
	/**
	 * Get the domain name queried.
	 * @return A domain name.
	 */
	public String getName() {
		return query;
	}
}