package com.company;

import java.net.ServerSocket;

 public class Car {

    // lights
    String lights;

    // doors
    int doors;

    // brand name
    String brandName;

    // model name
    String modelName;

    // model color
    char color;

    // Engine

    // Engine -> Cylinder Head
    String cylinderHead;

    // Engine -> Cylinder Block
    String cylinderBlock;

    // Engine -> Oil pan
    String oilPan;

    Sensors sensors = new Sensors();
    Engine engine = new Engine();

    // car gps

    String gps = "GPS Default ";


}
