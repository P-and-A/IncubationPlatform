package com.incubationplatform;

import com.incubationplatform.common.Const;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IncubationPlatformApplicationTests {

	@Test
	public void contextLoads() {
		Map<String,Object> conditionMap = new HashMap<>();
//		conditionMap.put("classification", Const.ProjectClassification.EXCELLENT_INNOVATE);
//		conditionMap.put("classification", Const.ProjectClassification.EXCELLENT_PRACTICE);
//		List<Project> excellentInnovates = projectDao.selectByMap(conditionMap);

	}

}
