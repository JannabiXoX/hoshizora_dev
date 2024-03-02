import cn.hutool.core.collection.CollUtil;
import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

/**
 * @Author:feiyang
 * @Date:10/27/2023 3:21 PM
 */

public class test {

    public static void main(String[] args) {
        LombokTest lombokTest = LombokTest.builder().id("1").name("liufeiyang").build();
        LombokTest lombokTest1 = LombokTest.builder().id("2").name("heqian").build();
        List<LombokTest> lombokTestList = Arrays.asList(lombokTest,lombokTest1);
        if (CollUtil.isNotEmpty(lombokTestList)) {
            System.out.println(JSON.toJSONString(lombokTestList));
        }
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class LombokTest{
        private String name;
        private String id;
    }
}
