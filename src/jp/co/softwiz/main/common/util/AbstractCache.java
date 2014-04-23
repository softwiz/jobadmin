package jp.co.softwiz.main.common.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class AbstractCache<KEY, DTO> {
    protected Map<KEY, List<DTO>> keyMap;

    public void reload() {
        Map<KEY, List<DTO>> tempMap = this.getAll();
        keyMap = Collections.unmodifiableMap(tempMap);

    }

    public Map<KEY, List<DTO>> getMap() {
        if (keyMap == null) { reload(); }
        return keyMap;
    }

    protected abstract Map<KEY, List<DTO>> getAll();

}




