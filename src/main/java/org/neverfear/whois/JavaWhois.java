package org.neverfear.whois;

import java.util.Set;

/**
 * A Java executable that takes a list of domain names and resolves them,
 * printing the whois server response.<br/>
 * Example usage:</br>
 * <code>java JavaWhois google.co.uk google.lc microsoft.com</code>
 * 
 * @author doug@neverfear.org
 * 
 */
public class JavaWhois {

	/**
	 * The method
	 * 
	 * @param args
	 *            A list of domain names to query.
	 * @throws Exception
	 */
	public static void main( String[] args ) throws Exception {
		Set<String> supportedTopLevelDomains = WhoisServerPool.getSupportedTLDSet();
		System.out.println( "Supported Top Level Domain" );
		for ( String topLevelDomain : supportedTopLevelDomains ) {
			System.out.append( topLevelDomain );
			System.out.append( " " );

		}
		System.out.println();
		try {
			for ( String domain : args ) {
				WhoisQuery query = new WhoisQuery( domain );
				WhoisResponse response = query.getResponse();
				System.out.println( "================ [WHOIS: " + response.getName() + "] ================" );
				System.out.println( response.getData() );
				for ( int i = 0; i < 5; i++ ) {
					System.out.println();
				}

			}
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}
