package com.shop.config.generator;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码生成器
 */
public class CodeGenerator {

    private final static String URL = "jdbc:mysql://49.234.70.24:3306/shop?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private final static String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private final static String USER_NAME = "root";
    private final static String PASSWORD = "a123456.";
    private final static String PROJECT_PATH = System.getProperty("user.dir");
    ;

    /**
     * 全局配置
     *
     * @return
     */
    private GlobalConfig globalConfiguration() {
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(PROJECT_PATH + "/src/main/java");
        gc.setAuthor("靳 旺");
        gc.setOpen(false);
        gc.setServiceImplName("%sServiceImpl");
        // 默认生成的 service 会有 I 前缀
        gc.setServiceName("%sService");
        gc.setEntityName("%sDo");
        gc.setMapperName("%sDoMapper");
        gc.setDateType(DateType.ONLY_DATE);
        gc.setFileOverride(true);
        return gc;
    }

    /**
     * 配置数据源
     *
     * @return
     */
    private DataSourceConfig getDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(URL);
        dsc.setDriverName(DRIVER_NAME);
        dsc.setUsername(USER_NAME);
        dsc.setPassword(PASSWORD);
        dsc.setDbType(DbType.MYSQL);    //数据库类型
        return dsc;
    }


    /**
     * 配置包
     *
     * @return
     */
    private PackageConfig getPackageConfig() {
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.shop");
        return pc;
    }


    /**
     * 自定义配置
     *
     * @return
     */
    private InjectionConfig customConfiguration() {
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        //  freemarker 引擎
        String templateXmlPath = "/templates/mapper.xml.ftl";
        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templateXmlPath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return PROJECT_PATH + "/src/main/resources/mappers/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    /**
     * xml 配置
     *
     * @return
     */
    private TemplateConfig xmlConfiguration() {
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setController(null);
        templateConfig.setXml(null);
        return templateConfig;
    }

    /**
     * 策略配置
     *
     * @return
     */
    private StrategyConfig strategyConfiguration(PackageConfig pc, String... tableName) {
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(tableName);
        strategy.setControllerMappingHyphenStyle(true);
        return strategy;
    }

    public void execute(String... tableName) {
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(this.globalConfiguration());
        mpg.setDataSource(this.getDataSourceConfig());
        PackageConfig pc = this.getPackageConfig();
        mpg.setPackageInfo(pc);
        mpg.setStrategy(this.strategyConfiguration(pc, tableName));
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.setTemplate(this.xmlConfiguration());
        mpg.setCfg(this.customConfiguration());
        mpg.execute();
    }

    public static void main(String[] args) {
        new CodeGenerator().execute("base_order","client", "classification",  "client_account", "client_role_relation"
                , "commodity", "commodity_color", "commodity_color_relation", "express", "industry", "industry_secondary_relation", "logistics_records",
                "merchant", "order_commodity_relation", "partner", "role", "secondary_industry", "system_parameter"
        );
//        new CodeGenerator().execute("base_order");
    }


}
