package racingcar.messenger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Messenger;

public class MessengerTest {

    private final Messenger messenger = new Messenger();

    @Test
    @DisplayName("자동차 이름 입력 요구 메시지를 올바르게 반환한다.")
    void requestCarNames() {
        // when
        String expectedString = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n";
        String string = messenger.getRequestCarNames();

        // then
        Assertions.assertEquals(string, expectedString);
    }

    @Test
    @DisplayName("라운드 횟수 입력 요구 메시지를 올바르게 반환한다.")
    void requestRoundCount() {
        // when
        String expectedString = "시도할 회수는 몇회인가요?\n";
        String string = messenger.getRequestRoundCount();

        // then
        Assertions.assertEquals(string, expectedString);
    }

    @Test
    @DisplayName("실행 결과 메시지를 올바르게 반환한다.")
    void requestPlayResultMessage() {
        // when
        String expectedString = "\n실행결과";
        String string = messenger.getPlayResultMessage();

        // then
        Assertions.assertEquals(string, expectedString);
    }

}
