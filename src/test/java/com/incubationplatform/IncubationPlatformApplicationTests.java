package com.incubationplatform;

import com.incubationplatform.common.Const;
import com.incubationplatform.pojo.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncubationPlatformApplicationTests {

	@Test
	public void contextLoads() {
		Map<String,Object> conditionMap = new HashMap<>();
		conditionMap.put("classification", Const.ProjectClassification.EXCELLENTINNOVATE);
		conditionMap.put("classification", Const.ProjectClassification.EXCELLENTPRACTICE);
//		List<Project> excellentInnovates = projectDao.selectByMap(conditionMap);

	}

}
