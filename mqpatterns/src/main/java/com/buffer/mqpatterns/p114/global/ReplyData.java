package com.buffer.mqpatterns.p114.global;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ReplyData {
    protected final Log logger = LogFactory.getLog(getClass());

    private String greeting;
    private int result[];

    public void logResult() {
        if (null != result) {
            logger.info("Factors in reply are:");
            for (int i : result) {
                logger.info(i);
            }
        } else {
            logger.warn("No factors found in reply");
        }
    }

    public void  calcResponse(int value) {
        // Should send some meaningful data, but for now.
        result = new int[] {1,2,3};
    }

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public int[] getResult() {
		return result;
	}

	public void setResult(int[] result) {
		this.result = result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(this.result);
		result = prime * result + Objects.hash(greeting);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyData other = (ReplyData) obj;
		return Objects.equals(greeting, other.greeting) && Arrays.equals(result, other.result);
	}

	public ReplyData(String greeting, int[] result) {
		super();
		this.greeting = greeting;
		this.result = result;
	}

	public ReplyData() {
		super();
	}

	@Override
	public String toString() {
		return "ReplyData [logger=" + logger + ", greeting=" + greeting + ", result=" + Arrays.toString(result) + "]";
	}
	
	

}