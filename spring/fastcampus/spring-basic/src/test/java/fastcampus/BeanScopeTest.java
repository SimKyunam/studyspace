package fastcampus;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mileNote on 2020-10-05
 * Blog : https://milenote.tistory.com
 * Github : https://github.com/SimKyunam
 */
public class BeanScopeTest {

//    @Test
//    void testIdentity(){
//        // 동일성 (identity): 객체 주소 같다. - (obj1 == obj2 == obj3) == true
//        // 동등성 (equals): 객체의 값이 같다. - (obj1.equals(obj2) == true
//        A a1 = new A();
//        A a2 = a1;
//
//        Assert.assertTrue(a1 == a2);
//
//    }

    @Test
    void testEquals(){
        A a1 = new A(10, "Hello world");
        A a2 = new A(10, "Hello world");
        A a3 = new A(3, "Hello");

        assertTrue(a1.equals(a2));
        assertFalse(a1.equals(a3));
    }
}

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
class A {
    private int a1;
    private String a2;
}
