import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class MyProjectTest {
    @Test
    public void dummyTestUsingJmockLib() {
       assertThat("ivan",is(equalTo("ivan")));
    }
}
