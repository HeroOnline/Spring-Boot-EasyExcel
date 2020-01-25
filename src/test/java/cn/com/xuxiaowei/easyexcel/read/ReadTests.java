package cn.com.xuxiaowei.easyexcel.read;

import cn.com.xuxiaowei.entity.User;
import com.alibaba.excel.EasyExcel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试 Excel 数据读取
 */
@Slf4j
@SpringBootTest
class ReadTests {

    /**
     * 读取本地项目文件夹路径（Spring Boot）
     */
    private String projectPath = System.getProperty("user.dir");

    /**
     * 默认读取 Sheet1
     * <p>
     * 使用 easyexcel 时，实体类不可使用<code>@Accessors(chain = true)</code>
     */
    @Test
    void simpleRead() {
        String simpleRead = projectPath + "/easyexcel/read/simpleRead.xlsx";
        log.debug("读取路径：{}", simpleRead);
        EasyExcel.read(simpleRead, User.class, new UserDataListener()).sheet().doRead();
    }

    /**
     * 自定义读取 Sheet2
     * <p>
     * 使用 easyexcel 时，实体类不可使用<code>@Accessors(chain = true)</code>
     */
    @Test
    void simpleReadSheet() {
        String simpleRead = projectPath + "/easyexcel/read/simpleRead.xlsx";
        log.debug("读取路径：{}", simpleRead);
        EasyExcel.read(simpleRead, User.class, new UserDataListener()).sheet("Sheet2").doRead();
    }

}