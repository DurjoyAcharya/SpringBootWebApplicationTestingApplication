package oopTesting.integrationTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {
    @Mock
    RectangleService rectangleService;
    @Mock
    SquareService squareService;
    @Mock
    CircleService circleService;
    @InjectMocks
    CalculateArea calculateArea;
    @BeforeEach
    void setUp() {
//        rectangleService = Mockito.mock(RectangleService.class);
//        squareService = Mockito.mock(SquareService.class);
//        circleService = Mockito.mock(CircleService.class);
//        calculateArea = new CalculateArea(squareService,rectangleService,circleService);
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void calculateRectangleAreaTest() {
        Mockito.when(rectangleService.area(5.0d,4.0d)).thenReturn(20d);
        Double calculatedArea = this.calculateArea.calculateArea(Type.RECTANGLE, 5.0d, 4.0d);
        assertEquals(20d,calculatedArea);
    }
}