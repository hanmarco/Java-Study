package paren;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		ArrayList<parenIndex> pairlist = new ArrayList<parenIndex>(); // 괄호들의 쌍의
																		// 인덱스
																		// 저장용
		
		Set<String> result  = new TreeSet<>();
		

		
		init(string, pairlist);

		loopCase(pairlist.size(), string, result, pairlist);

		for (String string2 : result) 
			System.out.println(string2);
		
	
	}

	public static void init(String string, ArrayList<parenIndex> list) {
		Stack<Node> stack = new Stack<>(); // 괄호 쌍 맞추기용 스택
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);

			if (c == '(') {
				stack.push(new Node(c, i));

			} else if (c == ')') {
				Node temp = stack.peek();
				if (temp.c == '(') {
					parenIndex Pair = new parenIndex(temp.index, i);
					list.add(Pair);
					stack.pop();
				}
			}

		}
	}

	public static void loopCase(int size, String string, Set<String> result, ArrayList<parenIndex> pairlist) {

		if (size >= 1) {
			for (int i = 0; i < pairlist.size(); i++) {
				ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
				parameter.add(pairlist.get(i));

				String ttt = casePrint(string, parameter);
				// if (!result.contains(ttt))
				result.add(ttt);

			}
		}

		if (size >= 2) {
			for (int i = 0; i < pairlist.size(); i++) {

				for (int j = i; j < pairlist.size(); j++) {
					if (j == i)
						continue;
					ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
					parameter.add(pairlist.get(i));
					parameter.add(pairlist.get(j));
					String ttt = casePrint(string, parameter);
					// if (!result.contains(ttt))
					result.add(ttt);
				}
			}
		}

		if (size >= 3) {
			for (int i = 0; i < pairlist.size(); i++) {
				for (int j = i + 1; j < pairlist.size(); j++) {

					for (int j2 = j + 1; j2 < pairlist.size(); j2++) {

						ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
						parameter.add(pairlist.get(i));
						parameter.add(pairlist.get(j));
						parameter.add(pairlist.get(j2));
						String ttt = casePrint(string, parameter);
						// if (!result.contains(ttt))
						result.add(ttt);
					}
				}
			}
		}

		if (size >= 4) {

			for (int t = 0; t < pairlist.size(); t++)
				for (int i = t + 1; i < pairlist.size(); i++) {

					for (int j = i + 1; j < pairlist.size(); j++) {

						for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
							ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
							parameter.add(pairlist.get(t));
							parameter.add(pairlist.get(i));
							parameter.add(pairlist.get(j));
							parameter.add(pairlist.get(j2));
							String ttt = casePrint(string, parameter);
							// if (!result.contains(ttt))
							result.add(ttt);
						}
					}
				}
		}

		if (size >= 5) {
			for (int u = 0; u < pairlist.size(); u++)
				for (int t = u + 1; t < pairlist.size(); t++) {

					for (int i = t + 1; i < pairlist.size(); i++) {

						for (int j = i + 1; j < pairlist.size(); j++) {

							for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
								ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
								parameter.add(pairlist.get(u));
								parameter.add(pairlist.get(t));
								parameter.add(pairlist.get(i));
								parameter.add(pairlist.get(j));
								parameter.add(pairlist.get(j2));
								String ttt = casePrint(string, parameter);
								// if (!result.contains(ttt))
								result.add(ttt);
							}
						}
					}
				}
		}

		if (size >= 6) {
			for (int i6 = 0; i6 < pairlist.size(); i6++) {
				for (int u = i6 + 1; u < pairlist.size(); u++) {

					for (int t = u + 1; t < pairlist.size(); t++) {

						for (int i = t + 1; i < pairlist.size(); i++) {

							for (int j = i + 1; j < pairlist.size(); j++) {

								for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
									ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
									parameter.add(pairlist.get(i6));
									parameter.add(pairlist.get(u));
									parameter.add(pairlist.get(t));
									parameter.add(pairlist.get(i));
									parameter.add(pairlist.get(j));
									parameter.add(pairlist.get(j2));
									String ttt = casePrint(string, parameter);
									// if (!result.contains(ttt))
									result.add(ttt);
								}
							}
						}
					}
				}
			}
		}

		if (size >= 7) {
			for (int i7 = 0; i7 < pairlist.size(); i7++) {
				for (int i6 = i7 + 1; i6 < pairlist.size(); i6++) {
					for (int u = i6 + 1; u < pairlist.size(); u++) {

						for (int t = u + 1; t < pairlist.size(); t++) {

							for (int i = t + 1; i < pairlist.size(); i++) {

								for (int j = i + 1; j < pairlist.size(); j++) {

									for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
										ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();

										parameter.add(pairlist.get(i7));
										parameter.add(pairlist.get(i6));
										parameter.add(pairlist.get(u));
										parameter.add(pairlist.get(t));
										parameter.add(pairlist.get(i));
										parameter.add(pairlist.get(j));
										parameter.add(pairlist.get(j2));
										String ttt = casePrint(string, parameter);
										// if (!result.contains(ttt))
										result.add(ttt);
									}
								}
							}
						}
					}
				}

			}
		}

		if (size >= 8) {
			for (int i8 = 0; i8 < pairlist.size(); i8++) {
				for (int i7 = i8 + 1; i7 < pairlist.size(); i7++) {
					for (int i6 = i7 + 1; i6 < pairlist.size(); i6++) {
						for (int u = i6 + 1; u < pairlist.size(); u++) {

							for (int t = u + 1; t < pairlist.size(); t++) {

								for (int i = t + 1; i < pairlist.size(); i++) {

									for (int j = i + 1; j < pairlist.size(); j++) {

										for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
											ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
											parameter.add(pairlist.get(i8));
											parameter.add(pairlist.get(i7));
											parameter.add(pairlist.get(i6));
											parameter.add(pairlist.get(u));
											parameter.add(pairlist.get(t));
											parameter.add(pairlist.get(i));
											parameter.add(pairlist.get(j));
											parameter.add(pairlist.get(j2));
											String ttt = casePrint(string, parameter);
											// if (!result.contains(ttt))
											result.add(ttt);
										}
									}
								}
							}
						}
					}

				}
			}
		}

		if (size >= 9) {

			for (int i9 = 0; i9 < pairlist.size(); i9++) {
				for (int i8 = i9 + 1; i8 < pairlist.size(); i8++) {
					for (int i7 = i8 + 1; i7 < pairlist.size(); i7++) {
						for (int i6 = i7 + 1; i6 < pairlist.size(); i6++) {
							for (int u = i6 + 1; u < pairlist.size(); u++) {

								for (int t = u + 1; t < pairlist.size(); t++) {

									for (int i = t + 1; i < pairlist.size(); i++) {

										for (int j = i + 1; j < pairlist.size(); j++) {

											for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
												ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
												parameter.add(pairlist.get(i9));
												parameter.add(pairlist.get(i8));
												parameter.add(pairlist.get(i7));
												parameter.add(pairlist.get(i6));
												parameter.add(pairlist.get(u));
												parameter.add(pairlist.get(t));
												parameter.add(pairlist.get(i));
												parameter.add(pairlist.get(j));
												parameter.add(pairlist.get(j2));
												String ttt = casePrint(string, parameter);
												// if (!result.contains(ttt))
												result.add(ttt);
											}
										}
									}
								}
							}
						}

					}
				}
			}
		}

		if (size >= 10) {
			for (int i10 = 0; i10 < pairlist.size(); i10++) {
			for (int i9 = i10+1; i9 < pairlist.size(); i9++) {
				for (int i8 = i9 + 1; i8 < pairlist.size(); i8++) {
					for (int i7 = i8 + 1; i7 < pairlist.size(); i7++) {
						for (int i6 = i7 + 1; i6 < pairlist.size(); i6++) {
							for (int u = i6 + 1; u < pairlist.size(); u++) {

								for (int t = u + 1; t < pairlist.size(); t++) {

									for (int i = t + 1; i < pairlist.size(); i++) {

										for (int j = i + 1; j < pairlist.size(); j++) {

											for (int j2 = j + 1; j2 < pairlist.size(); j2++) {
												ArrayList<parenIndex> parameter = new ArrayList<parenIndex>();
												parameter.add(pairlist.get(i10));
												parameter.add(pairlist.get(i9));
												parameter.add(pairlist.get(i8));
												parameter.add(pairlist.get(i7));
												parameter.add(pairlist.get(i6));
												parameter.add(pairlist.get(u));
												parameter.add(pairlist.get(t));
												parameter.add(pairlist.get(i));
												parameter.add(pairlist.get(j));
												parameter.add(pairlist.get(j2));
												String ttt = casePrint(string, parameter);
												// if (!result.contains(ttt))
												result.add(ttt);
											}
										}
									}
								}
							}
						}

					}
				}
			}
		}
		}

	}

	public static String casePrint(String str, ArrayList<parenIndex> list) {
		String result = "";
		ArrayList<Integer> list2 = new ArrayList<>();

		
		for (int i = 0; i < list.size(); i++) {
			list2.add(list.get(i).left);
			list2.add(list.get(i).right);
		}
		for (int i = 0; i < str.length(); i++) {
			if (!list2.contains(i))
				result += str.charAt(i);
		}
		return result;
	}
}

class Node {

	char c;
	int index;

	Node(char c, int index) {
		this.c = c;
		this.index = index;
	}
}

class parenIndex {
	int right;
	int left;

	public parenIndex(int l, int r) {
		left = l;
		right = r;
	}
}