package ru.tcreator.boot.profile.settings;

import ru.tcreator.boot.profile.SystemProfile;

public class DevProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "This is setting for develop mode";
    }
}
