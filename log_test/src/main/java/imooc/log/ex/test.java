package imooc.log.ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class test 
{
	static Logger logger = LoggerFactory.getLogger(test.class.getName());
    public static void main( String[] args ){
    	logger.error("日志内容"); //还有好多API
    }
}
