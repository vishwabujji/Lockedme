
public class File {

private int fileno;
private String filename;
File( int fileno,String filename){
	this.fileno = fileno;
	this.filename = filename;
	
	
}
public int getFileno() {
	return fileno;


}
public String getFilename() {
	return filename;
}
public String toString() {
	return filename+""+fileno ;
	
}
}