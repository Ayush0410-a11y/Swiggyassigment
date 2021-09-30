package snippet;

public class Snippet {
	#Set level
	log4j.rootCategory=debug, console, file  
	  
	# Appender which writes to console  
	log4j.appender.console=org.apache.log4j.ConsoleAppender  
	log4j.appender.console.layout=org.apache.log4j.PatternLayout
	log4j.appender.console.layout.ConversionPattern=%d{MM-dd-yyyy HH:mm:ss} %F %-5p [%t] %c{2} %L - %m%n
	  
	# Appender which writes to a file  
	log4j.appender.file=org.apache.log4j.RollingFileAppender
	log4j.appender.file.File=application.log
	  
	# Defining maximum size of a log file
	log4j.appender.file.MaxFileSize=10mb 
	log4j.appender.file.MaxBackupIndex=10
	log4j.appender.file.layout=org.apache.log4j.PatternLayout  
	log4j.appender.file.layout.ConversionPattern=%d{ISO8601} %5p [%t] %c{1}:%L - %m%n
	log4j.appender.file.Append=false
}

