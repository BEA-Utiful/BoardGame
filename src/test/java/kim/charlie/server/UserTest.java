package kim.charlie.server;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {
    @Test
    public void testNewUser() {
        User user = new User();
        user.setId("1");
        user.setName("Charlie");

        Assert.assertTrue("New User Test", user.getName().equals("Charlie"));
    }
}
