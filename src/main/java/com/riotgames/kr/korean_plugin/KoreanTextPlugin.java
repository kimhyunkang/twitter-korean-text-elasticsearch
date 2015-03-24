package com.riotgames.kr.korean_plugin;

import org.elasticsearch.plugins.AbstractPlugin;

public class KoreanTextPlugin extends AbstractPlugin {
    @Override
    public String name() {
        return "twitter-korean-text";
    }

    @Override
    public String description() {
        return "Plugin for twitter-korean-text analyzer";
    }
}