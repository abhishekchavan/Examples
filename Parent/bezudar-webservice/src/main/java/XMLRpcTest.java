import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

/**
 * 
 */

/**
 * @author Abhishek Chavan
 * 
 */
public class XMLRpcTest {

	public static void main(String[] args) throws Exception {
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		config.setServerURL(new URL("http://test.blogspam.net:8888/"));
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(config);
		Map<String, String> params = new HashMap<String, String>();
		params.put("ip", "121.12.12.3");
		params.put("comment", "You suck");
		params.put("name", "nutcase");
		String result = (String) client.execute("testComment", new Object[] { params });
		System.out.println(result);
	}
}
