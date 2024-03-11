package clasestest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

    @ParameterizedTest
    @MethodSource("esMagica")
    void testEsMagica(int[][] tabla, boolean expected) {
        boolean res = Tablas.esMagica(tabla);
        assertEquals(expected, res);
    }

    private static Stream<Arguments> esMagica() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 1, 1}, {1, 2, 4}, {1, 2, 5}}, false),
                Arguments.of(new int[][]{{-9}}, true)
        );
    }
	
	@ParameterizedTest
	@MethodSource("gira90")
	void testGira90(int tabla[][], int expected[][]) {
		int[][] res = Tablas.gira90(tabla);
		assertArrayEquals(res, expected);
	}
	private static Stream<Arguments> gira90(){
		return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}})
		);
	}


}
