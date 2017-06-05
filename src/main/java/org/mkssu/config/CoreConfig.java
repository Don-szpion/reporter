package org.mkssu.config;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.ResultSet;
import java.sql.Statement;

@Configuration
@ComponentScan("org.mkssu")
public class CoreConfig {

}
