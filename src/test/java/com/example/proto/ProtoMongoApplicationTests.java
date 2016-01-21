package com.example.proto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.springframework.data.mongodb.core.query.Criteria.where;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.Mongo;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProtoMongoApplication.class)
public class ProtoMongoApplicationTests {
	
	private static final Log log = LogFactory.getLog(ProtoMongoApplicationTests.class);

	
	@Test
	public void contextLoads() throws Exception {
		
		MongoOperations mongoOps = new MongoTemplate(new Mongo(), "database"); 
		mongoOps.insert(new Person("Joe", 34));
	    log.info(mongoOps.findOne(new Query(where("name").is("Joe")), Person.class));
	    log.info(mongoOps.findOne(new Query(where("age").is(34)), Person.class));
	   
	    mongoOps.dropCollection("person");
	}

}
