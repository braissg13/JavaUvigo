package ds.miniframework;

public class ChainPatternBuilder {
	  
	public MyLogger getChainOfLoggers(){

		  Logger errorLogger = new ErrorLogger(Logger.ERROR);
	      Logger fileLogger = new FileLogger(Logger.INFO);
	      Logger consoleLogger = new ConsoleLogger(Logger.DEBUG);

	     
	      fileLogger.setNextLogger(consoleLogger);
	      consoleLogger.setNextLogger(errorLogger);

	      return fileLogger;	
	   }
}
