package jp.pokepay.partnerapi;

class JsonBuilder {
    private StringBuilder buffer;
    private boolean first = true;
    private boolean alreadyToString = false;

    JsonBuilder() {
        buffer = new StringBuilder();
    }

    private void appendValue(Object value) {
        if (value instanceof String) {
            buffer.append('"');
            buffer.append(value);
            buffer.append('"');
        } else {
            buffer.append(value);
        }
    }

    private void emitDelimiter() {
        if (first) {
            first = false;
            buffer.append('{');
        } else {
            buffer.append(',');
        }
    }

    public void append(String key, Object value) {
        emitDelimiter();
        appendValue(key);
        buffer.append(':');
        appendValue(value);
    }

    public void appendRaw(String key, String json) {
        emitDelimiter();
        appendValue(key);
        buffer.append(':');
        buffer.append(json);
    }

    public String toString() {
        if (!alreadyToString) {
            alreadyToString = true;
            buffer.append('}');
        }
        return buffer.toString();
    }
}
