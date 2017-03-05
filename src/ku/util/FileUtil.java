package ku.util;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;

/**
 * FileUtil copy original file and create copy text file
 * @author Charin Tantrakul
 *
 */
public class FileUtil {

	/**
	 * Copy file byte by byte 
	 * @param in String or file that you want to copy
	 * @param out name of file that you want to make it same parameter 'in'.
	 */
	static void copy(InputStream in,OutputStream out) {
		try{
			int b = in.read(); 
			while( b >= 0 ) { 
				out.write( (byte)b );
				b = in.read( );  
			}
			in.close();
			out.close();
		}
		catch(IOException e){
			throw new RuntimeException();
		}
	}
	
	/**
	 * Copy file by using array of byte.
	 * @param in String or file that you want to copy
	 * @param out name of file that you want to make it same parameter 'in'.
	 * @param blocksize size of byte array 
	 */
	static void copy(InputStream in,OutputStream out,int blocksize){
		try{
			byte[] buffer = new byte[blocksize];
			int b;
			while( (b = in.read(buffer) ) > 0 ) { 
				out.write (buffer,0,b);
				b = in.read( );  
			}
			in.close();
			out.close();
		}
		catch(IOException e){
			throw new RuntimeException();
		}
	}

	/**
	 * Copy file by using BufferedReader and PrintWriter 
	 * @param in String or file that you want to copy
	 * @param out name of file that you want to make it same parameter 'in'.
	 */
	static void bcopy(InputStream in,OutputStream out){
		try{
			BufferedReader read = new BufferedReader(new InputStreamReader(in));
			PrintWriter write = new PrintWriter(out);
			String line = null;
			// readLine() is null when end of input is reached
			while( (line = read.readLine()) != null ) {
				write.println(line);
			}
			read.close();
            write.close();
		}
		catch(IOException e){
			throw new RuntimeException();
		}

	}
}
