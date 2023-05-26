import com.ysj.ysj_free.domain.User;
import com.ysj.ysj_free.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserMapperTest {
    private UserMapper userMapper;

    @Before
    public void setUp() throws IOException {
        String resource = "mybatis-config.xml";
        Reader reader = Resources.getResourceAsReader(resource);

        // SqlSessionFactory 생성
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        // SqlSession 생성
        SqlSession sqlSession = sqlSessionFactory.openSession();

        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testGetAllUsers() {
        // When
        List<User> userList = userMapper.getAllUsers();

        // Then
        assertNotNull(userList);
        assertTrue(userList.size() > 0);
    }

    @Test
    public void testLoginUser() {
        // Given
        String id = "test";
        String password = "test";

        // When
        User user = userMapper.loginUser(id, password);

        // Then
        assertEquals(id, user.getId());
    }

    @Test
    public void testInsertUser() {
        // Given
        User user = new User();
        user.setId("test123");
        user.setUserName("Test User");
        user.setPassword("testpassword");

        // When
        userMapper.insertUser(user);

        // Then

    }

}
