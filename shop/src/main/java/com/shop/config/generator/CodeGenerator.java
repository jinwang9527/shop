package com.shop.config.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
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
    private final static String PROJECT_PATH = System.getProperty("user.dir");;


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
        gc.setServiceImplName("%sService");
        gc.setEntityName("%sDo");
        gc.setFileOverride(true);
        return gc;
    }

    /**
     * 配置数据源
     * @return
     */
    private DataSourceConfig getDataSourceConfig(){
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(URL);
        dsc.setDriverName(DRIVER_NAME);
        dsc.setUsername(USER_NAME);
        dsc.setPassword(PASSWORD);
        return dsc;
    }


    /**
     * 配置包
     * @return
     */
    private PackageConfig getPackageConfig(){
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.shop");
        return pc;
    }


    /**
     * 自定义配置
     * @return
     */
    private  InjectionConfig customConfiguration(){
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
        //  freemarker 引擎
        String templatePath = "/templates/mapper.xml.ftl";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return PROJECT_PATH + "/src/main/resources/mappers/" + tableInfo.getEntityName() + "DoMapper" + StringPool.DOT_XML;
            }
        });

        cfg.setFileOutConfigList(focList);
        return cfg;
    }

    /**
     * xml 配置
     * @return
     */
    private TemplateConfig xmlConfiguration(){
        return new TemplateConfig();
    }

    /**
     * 策略配置
     * @return
     */
    private StrategyConfig strategyConfiguration(PackageConfig pc,String... tableName){
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude(tableName);
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix(pc.getModuleName() + "_");
        return strategy;
    }

    public void execute(String... tableName){
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(this.globalConfiguration());
        mpg.setDataSource(this.getDataSourceConfig());
        PackageConfig pc = this.getPackageConfig();
        mpg.setPackageInfo(pc);
        mpg.setTemplate(this.xmlConfiguration());
        mpg.setStrategy(this.strategyConfiguration(pc,tableName));
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();
    }

    public static void main(String[] args) {
        new CodeGenerator().execute("sys_log");
    }


}
