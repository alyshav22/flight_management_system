package com.flightreservationsystem.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.flightreservationsystem.model.services.factory.ServiceFactoryTest;
import com.flightreservationsystem.model.services.loginservice.LoginSvcImplTest;
import com.flightreservationsystem.model.services.registerservice.RegisterSvcImplTest;

@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class, LoginSvcImplTest.class, RegisterSvcImplTest.class})
public class AllServiceTests {

}
