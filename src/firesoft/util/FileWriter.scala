package firesoft.util

import java.nio.file.{Paths, Files}
import java.nio.charset.StandardCharsets

object FileWriter 
{
	def write(data : String, path : String)= {
		
	  Files.write(Paths.get(path), data.getBytes(StandardCharsets.UTF_8))
	}
}