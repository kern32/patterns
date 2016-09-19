package interpreter.expression;

class BExpression extends Expression {
	public void interpret(Context context) {
		System.out.println("b expression");
		String input = context.getInput();

		context.setInput(input.substring(1));
		context.setOutput(context.getOutput() + "2");
	}
}
