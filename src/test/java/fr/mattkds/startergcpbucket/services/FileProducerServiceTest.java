package fr.mattkds.startergcpbucket.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FileProducerServiceTest {
    @Test
    void shouldReturnFilename(){
        //Arrange
        String content = "fileTest";
        String fileNameExpected = "fileTest_generated.txt";
        FileProducerService fileProducerService = new FileProducerService();
        //Act
        String filenameActual = fileProducerService.getFileName(content);
        //Assert
        Assertions.assertEquals(fileNameExpected, filenameActual);
    }

}