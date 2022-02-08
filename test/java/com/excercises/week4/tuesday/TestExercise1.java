package com.excercises.week4.tuesday;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class TestExercise1 {
    @Test
    void testFindMostCommon(){
        // Given
        Exercise1 underTest = new Exercise1();
        String testInput = "1,1,1,1,3,4,5,6,7,7,7,8,8";

        // When
        List<String> actual = underTest.findMostCommon(testInput);

        // Then
        List<String> expected = new ArrayList<>();
        expected.add("1");
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void testFindTwoMostCommon(){
        // Given
        Exercise1 underTest = new Exercise1();
        String testInput = "1,1,1,1,3,4,5,6,7,7,7,7,8,8";

        // When
        List<String> actual = underTest.findMostCommon(testInput);

        // Then
        List<String> expected = new ArrayList<>();
        expected.add("1");
        expected.add("7");
        assertThat(actual).isEqualTo(expected);
    }
}
