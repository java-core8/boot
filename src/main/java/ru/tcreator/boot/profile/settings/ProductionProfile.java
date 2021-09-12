package ru.tcreator.boot.profile.settings;

import ru.tcreator.boot.profile.SystemProfile;

public class ProductionProfile implements SystemProfile {

    @Override
    public String getProfile() {
        return "This is setting for production mode";
    }
}
