package me.delusidiot.gof.structural_patterns.bridge.after;

import me.delusidiot.gof.structural_patterns.bridge.after.champions.Ahri;
import me.delusidiot.gof.structural_patterns.bridge.after.skin.KDA;

public class App {
    public static void main(String[] args) {
        Champion Ahri = new Ahri(new KDA());

        Ahri.skillE();
        Ahri.skillQ();
        // 지금 코드는 객체를 클라언트가 직접 생성할 수 있지만 이부분은 얼마든지 감출어 전달해 줄수 있습니다.
        // 이론적으로는 Client코드가 추상화 되어있는 Abstraction계층 구조만 사용하고 Abstraction 계층구조에 해당하는 Champion이
        // Implementation에 해당하는 Skin을 사용합니다. 각각의 스킨은 Concreate Implementation이 되고 각각의 챔피언은 Refined Abstraction에 해당합니다.
        // before보다 훨신더 간단히 구현할 수 있습니다.
    }
}
