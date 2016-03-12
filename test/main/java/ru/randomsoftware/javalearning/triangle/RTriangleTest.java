package ru.randomsoftware.javalearning.triangle;

import org.junit.Test;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

/**
 * Created by stille on 12.03.16.
 */
public class RTriangleTest {

    @Test
    public void exampleTest() {
        RTriangle triangle = RTriangleProvider.getTriangle();
        assertThat("Координата X первой вершины неотрицательна", triangle.getApexX1(), not(lessThan(0)));
    }

}
