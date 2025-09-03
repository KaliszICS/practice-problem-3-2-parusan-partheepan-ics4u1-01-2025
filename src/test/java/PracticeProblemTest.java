import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class PracticeProblemTest {
@Test
@DisplayName("")
void towerOfHanoiTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
    assertEquals(-1, (int)method.invoke(null, 2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(-1, (int)method.invoke(null, 0));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(-1, (int)method.invoke(null, -5));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest4() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(-1, (int)method.invoke(null, 1));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest5() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(7, (int)method.invoke(null, 3));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest6() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(63, (int)method.invoke(null, 6));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest7() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(32767, (int)method.invoke(null, 15));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void towerOfHanoiTest8() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class<?>[] cArg = {int.class};
        Method method = testClass.getDeclaredMethod("towerOfHanoi", cArg);
  // Enter code here
  assertEquals(1023, (int)method.invoke(null, 10));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
