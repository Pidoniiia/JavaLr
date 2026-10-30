package org.example;

public class Editor implements Installable, Updatable {
    private String name;
    private String version;
    private String format;

    public Editor(String name, String version, String format) {
        this.name = name;
        this.version = version;
        this.format = format;
    }

    @Override
    public void install() {
        System.out.println("Редактор " + name + " для файлов " + format + " установлен ");
    }

    @Override
    public void uninstall() {
        System.out.println("Редактор " + name + " успешно удален");
    }

    @Override
    public void update() {
        this.version = "pro_v27";
        System.out.println("Редактор " + name + " успешно обновлен до версии " + version);
    }

    @Override
    public String getVersion() {
        return this.version;
    }
}
