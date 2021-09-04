package com.nishimu0507.kotlinsampleapi.infrastructure.database

import org.mybatis.spring.SqlSessionFactoryBean
import org.mybatis.spring.SqlSessionTemplate
import org.mybatis.spring.annotation.MapperScan
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import javax.sql.DataSource

@Configuration
@MapperScan(basePackages = ["com.nishimu0507.kotlinsampleapi.infrastructure.mapper"], sqlSessionTemplateRef = "accountMasterSqlSessionTemplate")
class AccountMasterDataSourceConfig {

    @Primary
    @Bean(name = ["accountMasterDataSource"])
    @ConfigurationProperties(prefix = "datasource")
    fun dataSource(): DataSource {
        return DataSourceBuilder.create().type(org.apache.tomcat.jdbc.pool.DataSource::class.java).build()
    }

    @Primary
    @Bean(name = ["accountMasterTransactionManager"])
    fun transactionManager(@Qualifier("accountMasterDataSource") dataSource: DataSource): DataSourceTransactionManager {
        println("test......")
        println(dataSource)
        val transactionManager = DataSourceTransactionManager()
        transactionManager.dataSource = dataSource
        return transactionManager
    }

    @Primary
    @Bean(name = ["accountMasterSqlSessionTemplate"])
    @Throws(Exception::class)
    fun sqlSessionTemplate(@Qualifier("accountMasterDataSource") dataSource: DataSource): SqlSessionTemplate {
        val bean = SqlSessionFactoryBean()
        bean.setDataSource(dataSource)
        val conf = org.apache.ibatis.session.Configuration()
        conf.isMapUnderscoreToCamelCase = true
        bean.setConfiguration(conf)
        return SqlSessionTemplate(bean.`object`)
    }
}