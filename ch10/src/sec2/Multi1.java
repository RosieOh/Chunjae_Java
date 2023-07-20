package sec2;

import java.util.Map;
// 인터페이스는 오버라이드를 무조건 해줘야됨!
public class Multi1<K, V> implements Map.Entry<K, V>{                       // Entry : 구조
    private K key;
    private V value;

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return value;
    }
}
