module kermitrunner {
    requires hanyaeger;

    exports com.github.hanyaeger.beroepsproduct;

    opens audio;
    opens backgrounds;
    opens sprites;
    exports com.github.hanyaeger.beroepsproduct.scenes;
    exports com.github.hanyaeger.beroepsproduct.maps;
}
