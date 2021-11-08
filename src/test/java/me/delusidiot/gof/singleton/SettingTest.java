package me.delusidiot.gof.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.Assertions.assertThat;

class SettingTest {
    @Test
    @DisplayName("가장 단순한 싱글톤")
    void normalSingletonInstanceCheck(){
        Setting setting1 = Setting.getInstance();
        Setting setting2 = Setting.getInstance();

        assertThat(setting1).isEqualTo(setting2);
    }
    @Test
    @DisplayName("멀티쓰레드 환경1")
    void instanceCheck1(){
        SettingSafe1 setting1 = SettingSafe1.getInstance();
        SettingSafe1 setting2 = SettingSafe1.getInstance();

        assertThat(setting1).isEqualTo(setting2);
    }
    @Test
    @DisplayName("멀티쓰레드 환경2")
    void instanceCheck2(){
        SettingSafe2 setting1 = SettingSafe2.getInstance();
        SettingSafe2 setting2 = SettingSafe2.getInstance();

        assertThat(setting1).isEqualTo(setting2);
    }
    @Test
    @DisplayName("멀티쓰레드 환경3")
    void instanceCheck3(){
        SettingSafe3 setting1 = SettingSafe3.getInstance();
        SettingSafe3 setting2 = SettingSafe3.getInstance();

        assertThat(setting1).isEqualTo(setting2);
    }
    @Test
    @DisplayName("멀티쓰레드 환경4")
    void instanceCheck4(){
        SettingSafe4 setting1 = SettingSafe4.getInstance();
        SettingSafe4 setting2 = SettingSafe4.getInstance();

        assertThat(setting1).isEqualTo(setting2);
    }
    @Test
    @DisplayName("Reflection으로 Singleton 깨뜨리기")
    void singletonBreakReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SettingSafe4 setting1 = SettingSafe4.getInstance();
        Constructor<SettingSafe4> constructor = SettingSafe4.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SettingSafe4 setting2 = constructor.newInstance();

        assertThat(setting1).isNotEqualTo(setting2);
    }
    @Test
    @DisplayName("Serializable로 Singleton 깨뜨리기")
    void singletonBreakSerializable() throws IOException, ClassNotFoundException {
        SettingSafe5 setting1 = SettingSafe5.getInstance();
        SettingSafe5 setting2 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(setting1);
        }
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            setting2 = (SettingSafe5) in.readObject();
        }
        assertThat(setting1).isNotEqualTo(setting2);
    }
    @Test
    @DisplayName("Reflection 막기")
    void singletonDetectReflection(){
        Constructor<?>[] declaredConstructors = SettingSafeReflection.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                constructor.newInstance();
            });
        }
    }
}