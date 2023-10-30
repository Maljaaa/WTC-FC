package racingcar.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static racingcar.view.OutputView.*;

class OutputViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream systemOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(systemOut);
    }

    @Test
    public void 자동차_이름_프롬프트_출력() throws Exception {
        //given
        //when
        displayCarNamePrompt();
        //then
        assertEquals("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n", outContent.toString());
    }

    @Test
    public void 게임_시도_횟수_프롬프트_출력() throws Exception {
        //given
        //when
        displayAttemptPrompt();
        //then
        assertEquals("시도할 회수는 몇회인가요?\n", outContent.toString());
    }

    @Test
    public void 현재_게임_결과_출력() throws Exception {
        //given
        String carName = "pobi";
        String positionInDashes = "-";
        //when
        displayCurrentGameResult(carName, positionInDashes);
        //then
        assertEquals("pobi : -\n", outContent.toString());
    }

    @Test
    public void 결과_헤더_출력() throws Exception {
        //given
        //when
        displayResultHeader();
        //then
        assertEquals("\n실행 결과\n", outContent.toString());
    }

    @Test
    public void 우승자_출력() throws Exception {
        //given
        String name = "pobi";
        //when
        displayWinner(name);
        //then
        assertEquals("최종 우승자 : pobi\n", outContent.toString());
    }

}