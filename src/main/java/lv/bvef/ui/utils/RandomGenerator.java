package lv.bvef.ui.utils;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import testHelpers.ValuesKeeper;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    private static Logger logger = Logger.getLogger(RandomGenerator.class);

    public static String randomString(String type, int length) {
        String r = RandomStringUtils.randomAlphabetic(length);
        logger.info(String.format("Random %s is: %s", type, r));
        ValuesKeeper.saveValueToList(r);
        return r;
    }

    public static String randomEmail(int length) {
        String r = RandomStringUtils.randomAlphabetic(length);
        String rm = r + "@email.com";
        logger.info(String.format("Random mail is: %s", rm));
        return rm;
    }

    public static String randomInt(String type, int xRange, int yRange) {
        int r = ThreadLocalRandom.current().nextInt(xRange, yRange);
        logger.info(String.format("Random %s is: %s", type, r));
        return String.valueOf(r);
    }

    public static String randomMonthPicker(String type) {
        String re = null;
        Random r = new Random();
        List<String> givenList = Lists.newArrayList(
                "September",
                "October",
                "November",
                "December");

        int numberOfElements = 1;

        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = r.nextInt(givenList.size());
            re = givenList.get(randomIndex);
            givenList.remove(randomIndex);
        }
        logger.info(String.format("Random %s is: %s", type, re));
        return re;
    }
}