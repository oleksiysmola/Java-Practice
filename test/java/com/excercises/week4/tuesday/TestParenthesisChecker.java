package com.excercises.week4.tuesday;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class TestParenthesisChecker {
    @Test
    void testCheckParenthesisAreBalanced(){
        // Given
        ParenthesisChecker underTest = new ParenthesisChecker();
        String testInput = "[{{[(){}]}}[]{}{{(())}}]";

        // When
        boolean actual = underTest.checkParenthesisAreBalanced(testInput);

        // Then
        assertThat(actual).isTrue();

    }
}
