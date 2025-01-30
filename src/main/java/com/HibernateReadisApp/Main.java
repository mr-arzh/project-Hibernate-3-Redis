package com.HibernateReadisApp;
import com.HibernateReadisApp.dao.CityDAO;
import com.HibernateReadisApp.dao.CountryDAO;
import org.hibernate.SessionFactory;
import com.fasterxml.jackson.databind.*;

import io.lettuce.core.RedisClient;

private final SessionFactory sessionFactory;
private final RedisClient redisClient;

private final ObjectMapper mapper;

private final CityDAO cityDAO;
private final CountryDAO countryDAO;

public Main() {
//    sessionFactory = prepareRelationalDb();
//    cityDAO = new CityDAO(sessionFactory);
//    countryDAO = new CountryDAO(sessionFactory);
//
//    redisClient = prepareRedisClient();
//    mapper = new ObjectMapper();
}

public class Main {
}
