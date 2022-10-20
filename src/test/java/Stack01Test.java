import com.likelion.Stack01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

class Stack01Test {

    @BeforeEach
    void setUp(){
        //이 부분은 무조건 먼저실행되고 각각의 테스트가 진행됨
    }

    @Test
    void pushTest(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
        Integer[] arr = stack01.getArr();

        Assertions.assertEquals(10,arr[0]);
        Assertions.assertEquals(20,arr[1]);
    }

    @Test
    void pushAndPop(){
        Stack01 st = new Stack01();
        st.push(30);
        Assertions.assertEquals(30,st.pop());
        Assertions.assertThrows(EmptyStackException.class,()->{
            st.pop();
        });
    }

    @Test
    void isEmpty(){
        Stack01 st = new Stack01();
        Assertions.assertTrue(st.isEmpty());
        st.push(10);
        Assertions.assertFalse(st.isEmpty());
        st.pop();
        Assertions.assertTrue(st.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer> st = new Stack<>();
        Assertions.assertThrows(EmptyStackException.class,()->{
            st.pop();
        });
    }
    @Test
    void peek(){
        Stack01 st = new Stack01();
        Assertions.assertThrows(EmptyStackException.class,()->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        Assertions.assertEquals(10,peeked);
    }
}
