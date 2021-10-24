package com.rawchen.multitablejoin.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * 代码生成器
 *
 * @author RawChen
 * @since 2021-10-12 14:05
 */
public class MpGenerator {

	final static String  dirPath = "E:/IDEA-PROJ/MultiTableJoin/src/main/java";

	public static void main(String[] args) {
		AutoGenerator mpg = new AutoGenerator();
		// 选择 freemarker 引擎，默认 Veloctiy
		mpg.setTemplateEngine(new FreemarkerTemplateEngine());

		// 全局配置
		GlobalConfig gc = new GlobalConfig();
		gc.setOutputDir(dirPath);
		gc.setAuthor("RawChen");
		gc.setDateType(DateType.ONLY_DATE);
		gc.setFileOverride(true); //是否覆盖
		gc.setActiveRecord(false);// 是否有ActiveRecord特性(继承Model类即可实现基本CRUD)
		gc.setEnableCache(false);// XML 二级缓存
		gc.setBaseResultMap(true);// XML ResultMap
		gc.setBaseColumnList(true);// XML columList

		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		gc.setServiceName("%sService");
		// gc.setMapperName("%sDao");
		// gc.setXmlName("%sMapper");
		// gc.setServiceImplName("%sServiceDiy");
		// gc.setControllerName("%sAction");
		mpg.setGlobalConfig(gc);

		// 数据源配置
		DataSourceConfig dsc = new DataSourceConfig();
		dsc.setDbType(DbType.MYSQL);
		dsc.setTypeConvert(new MySqlTypeConvert(){
			// 自定义数据库表字段类型转换【可选】
//            public DbColumnType processTypeConvert(String fieldType) {
//                System.out.println("转换类型：" + fieldType);
//                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
//                return super.processTypeConvert(fieldType);
//            }
		});
		dsc.setDriverName("com.mysql.jdbc.Driver");
		dsc.setUsername("root");
		dsc.setPassword("root");
		dsc.setUrl("jdbc:mysql://localhost:3306/multi_table_join?serverTimezone=UTC&characterEncoding=utf8&useUnicode=true&useSSL=false");
		mpg.setDataSource(dsc);

		// 策略配置
		StrategyConfig strategy = new StrategyConfig();
		strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
//		strategy.setInclude(new String[] { "blog", "category", "tag" }); // 需要生成的表
		strategy.setInclude(new String[] { "blog_tag"}); // 需要生成的表
		// strategy.setExclude(new String[]{"user"}); // 排除生成的表(与Include互斥)
		// strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
		// strategy.setTablePrefix(new String[] { "tb_", "sys_" });// 此处可以修改为您的表前缀

		// 自定义实体父类
		// strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
		// 自定义实体，公共字段
		// strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
		// 自定义 mapper 父类
		// strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
		// 自定义 service 父类
		// strategy.setSuperServiceClass("com.baomidou.demo.TestService");
		// 自定义 service 实现类父类
		// strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
		// 自定义 controller 父类
		// strategy.setSuperControllerClass("com.baomidou.demo.TestController");
		// 【实体】是否生成字段常量（默认 false）
		// public static final String ID = "test_id";
		// strategy.setEntityColumnConstant(true);
		// 【实体】是否为构建者模型（默认 false）
		// public User setName(String name) {this.name = name; return this;}
		// strategy.setEntityBuilderModel(true);
		mpg.setStrategy(strategy);

		// 包配置
		PackageConfig pc = new PackageConfig();
		pc.setParent("com.rawchen.multitablejoin");
		//pc.setModuleName("good"); //父包模块
		pc.setController("controller");
		pc.setEntity("entity");
		pc.setMapper("mapper");
		pc.setService("service");
		pc.setServiceImpl("service.impl");
		pc.setXml("mapper");

		mpg.setPackageInfo(pc);

		// 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
		InjectionConfig cfg = new InjectionConfig() {
			@Override
			public void initMap() {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
				this.setMap(map);
			}
		};

		mpg.setCfg(cfg);

		// 执行生成
		mpg.execute();

		// 打印注入设置【可无】
		System.err.println(mpg.getCfg().getMap().get("abc"));
	}

}