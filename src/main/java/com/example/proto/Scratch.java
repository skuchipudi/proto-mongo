package com.example.proto;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.example.proto.*;
import com.mongodb.Mongo;

public class Scratch {

	private static final Log log = LogFactory.getLog(Scratch.class);

	public void myback() throws Exception {
	// TODO - return a real registration info with serveraddress, path, userid, pass to the ftp server
				// Based on the token t you can read this from the database.
				MongoOperations mongoOps = new MongoTemplate(new Mongo(), "database"); 
			    //RegistrationInfo registrationInfo = new RegistrationInfo(token, "serverAddress", "remoteAddress", "localAddress", "userId", "password");
			    //mongoOps.insert(registrationInfo);
			    log.info("query serverAddress==>" + mongoOps.findOne(new Query(where("serverAddress").is("serverAddress")), RegistrationInfo.class));
			    log.info("query serverAddress==>" + mongoOps.findOne(new Query(where("token").is("SECRET_KEY")), RegistrationInfo.class));
			    log.info("query _secretKey==>" + mongoOps.findOne(new Query(where("_secretKey").is("SECRET_KEY")), RegistrationInfo.class));
				//Query q1  =  new Query(where("token._secretKey").is(token.getSecretKey()));
			    //log.debug("query Token=>"+ mongoOps.findOne(q1,RegistrationInfo.class));
			    
			    Query q2  =  new Query(where("serverAddress").is("serverAddress"));
			    //log.info("query Token==" + q.toString());
			    log.debug("query serverAddress=>"+ mongoOps.findOne(q2,RegistrationInfo.class));
			    
			    Query q3  =  new Query(where("password").is("password"));
			    //log.info("query Token==" + q.toString());
			    log.info("query Password=>"+ mongoOps.findOne(q3,RegistrationInfo.class));
			  	
			    log.info("query Password=>"+ mongoOps.findOne(q3,RegistrationInfo.class));
			    log.info("-------------------------------------------------------------\n");
			  	
			  
	}
	
}
