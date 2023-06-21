package com.forest.core.common.util;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzl
 * @version 1.0
 * ClassName：DozerUtil
 * Date：2023/6/20
 * Description：
 */
public class DozerUtil {

    private static final Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <T> T converter(Object source, Class<T> target) {
        if (source == null) {
            return null;
        }
        return mapper.map(source, target);
    }

    public static <T> List<T> converterList(List<?> sourceList, final Class<T> target) {
        final List<T> result = new ArrayList<T>();
        if (sourceList == null || sourceList.isEmpty()) {
            return result;
        }
        sourceList.forEach(i -> result.add(mapper.map(i, target)));
        return result;
    }
}
