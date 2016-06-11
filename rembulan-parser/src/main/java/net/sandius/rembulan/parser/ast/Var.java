package net.sandius.rembulan.parser.ast;

import net.sandius.rembulan.util.Check;

public class Var implements LValueExpr, RValueExpr {

	private final Name name;

	public Var(Name name) {
		this.name = Check.notNull(name);
	}

	@Override
	public String toString() {
		return "(var " + name + ")";
	}

}
